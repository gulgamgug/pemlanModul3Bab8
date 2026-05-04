package tugas_praktikum;

public class Employee implements Payable {
    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;

    public Employee(String name, int regisNumber, int salaryPerMonth, Invoice[] kasbon ) {
        this.name = name;
        this.registrationNumber = regisNumber;
        this.salaryPerMonth = salaryPerMonth; 
        this.invoices = kasbon;
    }
    
    double totalPay;

    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("* Informasi Karyawan --------------\n");
        s.append("Nomor Registrasi: ").append(this.registrationNumber).append("\n");
        s.append("Nama Karyawan   : ").append(this.name).append("\n");
        s.append("Gaji            : ").append(this.salaryPerMonth).append("\n");
        s.append("\n* Detail Belanjaan ----------------\n");
        
        int totalHutang = 0;

        if (this.invoices != null && this.invoices.length >0) {
            for (int i=0; i<invoices.length; i++) {
                s.append(i+1).append(". ").append(invoices[i].toString()).append("\n");
                totalHutang += invoices[i].getPayableAmmount();
            }
        }

        s.append("\nTotal Tagihan: ").append(totalHutang).append("\n");
        s.append("Gaji Bersih  : ").append(this.getPayableAmmount()).append("\n");

        return s.toString();
    }

    @Override
    public double getPayableAmmount() {
        for (int i=0; i<invoices.length; i++) {
            totalPay += invoices[i].getPayableAmmount();
        }
        return salaryPerMonth-totalPay;
    }


    
}