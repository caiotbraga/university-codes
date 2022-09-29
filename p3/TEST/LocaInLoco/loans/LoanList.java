package loans;

import java.util.ArrayList;
import java.util.List;

import Exceptions.ExistLoanException;

public class LoanList {
    
    private List<Loans> loanList;

    public LoanList(){
        loanList = new ArrayList<>();
    }


    public void add(Loans loan) throws ExistLoanException{
        if(existLoan(loan.getLoanId()) == true){
            ExistLoanException msg = new ExistLoanException();
            throw msg;
        }
        else{
            loanList.add(loan);
        }
    }

    public boolean existLoan(String loanId){
        for (Loans loan : loanList) {
            if(loan.getLoanId().compareTo(loanId) == 0)
                return true;
        }
        return false;
    }
}
