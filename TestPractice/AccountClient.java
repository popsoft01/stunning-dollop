package TestPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountClient {


//    @Test
//    void accountIsOkay(){
//        Account myAccount = new Account();
//        assertTrue(myAccount);
//    }

    @Test
    void accountCanHaveA_Name(){
        Account myAccount = new Account();
        myAccount.setName("ojo","ade");
        assertEquals("ojo ade",myAccount.getName());

    }


}
