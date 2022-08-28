package P3.A1.Enums;

public enum AccountType {
    CHECKING(0),
    SAVINGS(1);
   
    public int typeAcc;
    AccountType(int type){
        typeAcc = type;
    }
}

