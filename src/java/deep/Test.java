package deep;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Company company = new Company();
        company.setId("1");
        company.setName("公司A");
        company.setAddress("北京");

        Invoice invoice = new Invoice();
        invoice.setId("1");
        invoice.setApplyuserid("1");
        invoice.setApplayusername("小丽");
        invoice.setApplayprice(new BigDecimal(120));
        invoice.setApplytime("2017-3-22");
        invoice.setDecription("吃饭报销");

        company.setInvoice(invoice);

        Company company_clone= company.clone();

        System.out.println("(company==company_clone)="+(company==company_clone));

        System.out.println("(company.getInvoice)="+(company.getInvoice()));

        System.out.println("(company_clone.getInvoice)="+(company_clone.getInvoice()));

        System.out.println("(company.getInvoice()==company_clone.getInvoice)="+(company.getInvoice()==company_clone.getInvoice()));

        System.out.println("改变发票");

        company_clone.getInvoice().setApplayusername("阿奇");
        System.out.println("(company.getInvoice)="+(company.getInvoice()));
        System.out.println("(company_clone.getInvoice)="+(company_clone.getInvoice()));
    }
}
