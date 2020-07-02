package tests;

import controller.SupporterController;
import general_classes.Supporter_details;
import junit.framework.Assert;
import model.repository.SupporterRepository;
import model.repository.SupporterRepositoryImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SupporterControllerTest {
    private static Supporter_details supporter1;
    private static Supporter_details supporter2;
    private static Supporter_details supporter3;
    private static SupporterController supportercontroller;

    @BeforeEach
    void setUp() throws Exception {
        supporter1=new Supporter_details("Coral","Nantanya","0505568911");
        supporter2=new Supporter_details("Coral","Nantanya","0505568911");
        supporter3=new Supporter_details("","","0545400251");
        supportercontroller=new SupporterController();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test Started");
    }

    @Test
    public void testadded_exist() throws Exception {
        supportercontroller.addSupoorter(supporter1.getSupporter_name(),supporter1.getSupporter_city(),supporter1.getSupporter_telephone());
          //  Exception exception = assertThrows(Exception.class, () -> {
         //       supportercontroller.addSupoorter(supporter2.getSupporter_name(),supporter2.getSupporter_city(),supporter2.getSupporter_telephone());
         //   });

        try {
            supportercontroller.addSupoorter(supporter2.getSupporter_name(),supporter2.getSupporter_city(),supporter2.getSupporter_telephone());
        }
        catch (Exception e) {
            Assert.fail("Exception " + e);
        }
        try
        {
            supportercontroller.addSupoorter(supporter3.getSupporter_name(),supporter3.getSupporter_city(),supporter3.getSupporter_telephone());
        }
        catch (Exception ex){
            Assert.fail("Exception " + ex);
        }

        //    String expectedMessage = "Already exists!";
        //    String actualMessage = exception.getMessage();

         //   assertTrue(actualMessage.contains(expectedMessage));

       // Exception exception1 = assertThrows( IllegalArgumentException.class, () -> {
        //    supportercontroller.addSupoorter(supporter3.getSupporter_name(),supporter3.getSupporter_city(),supporter3.getSupporter_telephone());
        //});

     //   String expectedMessage1 = "Username or password must not be null";
      //  String actualMessage1 = exception1.getMessage();

      //  assertTrue(actualMessage1.contains(expectedMessage1));
        }

    public void testedit() throws Exception{

    }

    }


