package controller;


import model.service.ForgetService;

public class ForgetPasswController {

    public ForgetService forgetService;
    public ForgetPasswController() throws Exception {

        forgetService=new ForgetService();

    }
    public boolean Change_pass(String email, String Newpassword) {
        if (email == null || email.trim().equals("") || Newpassword == null || Newpassword.trim().equals("")) {
            throw new IllegalArgumentException("Email or password must not be null");
        }

        String session = null;
        try {
            session = forgetService.Change_pass(email, Newpassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
