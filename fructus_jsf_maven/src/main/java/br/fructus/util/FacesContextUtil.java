
 
package br.fructus.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;


public class FacesContextUtil {
    private static final String HIBERNATE_SESSION = "HIBERNATE_SESSION";
    
    public static void setRequestSession(Session session){
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, session);
    }
    public static Session getRequestSession() {
        return (Session)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }
    
}
