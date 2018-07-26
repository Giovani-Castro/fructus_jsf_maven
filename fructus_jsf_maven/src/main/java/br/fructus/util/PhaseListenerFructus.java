
package br.fructus.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.hibernate.Session;


public class PhaseListenerFructus implements PhaseListener {
    // antes da fase
    @Override
    public void afterPhase(PhaseEvent pe) {
        if (pe.getPhaseId().equals(PhaseId.RESTORE_VIEW)){
            System.out.println("antes da fase"+ getPhaseId());
            Session session = NovoHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            FacesContextUtil.setRequestSession(session);
            
        }
    }
    //dapois da fase
    @Override
    public void beforePhase(PhaseEvent pe) {
        System.out.println("depois da fase"+ getPhaseId());
        if (pe.getPhaseId().equals(PhaseId.RENDER_RESPONSE)){
            Session session = FacesContextUtil.getRequestSession();
            try {
                session.getTransaction().commit();
            } catch (Exception e) {
                if (session.getTransaction().isActive())
                    session.getTransaction().rollback();
            }finally{
                session.close();
            }
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
