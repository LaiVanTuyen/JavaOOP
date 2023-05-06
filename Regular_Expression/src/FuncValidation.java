public class FuncValidation {
    private static String regex = "";
    public static boolean checkId(String id) {
        regex = "^STD-[\\d]{4}$";
        return id.matches(regex);
    }

    public static boolean checkPhone(String phone) {
        regex = "^0[1-9][\\d]{8}|(\\+84[1-9][\\d]{8})$";
        return phone.matches(regex);
    }
    public static boolean checkEmail(String email) {
        regex = "^[\\w\\d-_.]{3,20}@[\\w]{3,7}+(.[\\w]{2,5}){1,5}$";
        return email.matches(regex);
    }
}
