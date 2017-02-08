
package br.fructus.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class HibernateUtil {
    
    private static final SessionFactory sessionfactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static{
            try{
        
                System.out.println("tentando abrir uma SF");
                Configuration configuration = new onfiguration().configure();
                }
            }catch (exception e){
            
            }
    }
}
