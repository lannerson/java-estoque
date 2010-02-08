/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javapersistentunit;
import javax.swing.*;
import br.com.devmedia.jpa.entity.*;
import br.com.devmedia.jpa.entity.RecDet_cp;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author martins
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    private static final long serialVersionUID = 1L;


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("siscomPersistent");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
/*
        Banco newB = new Banco();
        newB.setCOD_BANCO(11);
        newB.setGERENTE_BANCO("MARTINS");
        em.persist(newB);

      
        Banco b =  em.find(Banco.class, 2);
      

       JOptionPane.showMessageDialog(null, "o gerente da conta é"+b.getGERENTE_BANCO());

        b.setGERENTE_BANCO("MARTINS PEREIRA");
 *
 *
 */

       // RecDet_cp requisicaoComp = new RecDet_cp();

        RecDet_cp_pk requicicaoComPk = new RecDet_cp_pk(1,"dois");
        //requisicaoComp.setId(requicicaoComPk);
      //  requisicaoComp.setVlrTotalOrcDet(1.0);
     //   em.persist(requisicaoComp);


       RecDet_cp requisicaoComp2 = em.find(RecDet_cp.class, requicicaoComPk);
      

       JOptionPane.showMessageDialog(null, "o gerente da conta é"+requisicaoComp2.getVlrTotalOrcDet());

        requisicaoComp2.setVlrTotalOrcDet(1.0);



        em.getTransaction().commit();
        em.close();
        emf.close();

       // System.out.println("o gerente é "+b.getGERENTE_BANCO());
        // TODO code application logic here
    }

}
