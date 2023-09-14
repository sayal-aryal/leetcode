/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.hashMap;

/**
 *
 * @author User
 */
public class UniqiueEmailAddress {

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        UniqiueEmailAddress uea = new UniqiueEmailAddress();
        uea.numUniqueEmails(emails);
    }

    public int numUniqueEmails(String[] emails) {

        for (String email : emails) {
            StringBuilder name = new StringBuilder();
            StringBuilder domain = new StringBuilder();
            int indexAt = email.indexOf('@');

            domain.append(email.substring(indexAt));
            name.append(email.substring(0, indexAt));
            System.out.println(email.substring(0, indexAt));
            System.out.println(email.substring(indexAt));

            if (name.toString().contains(".")) {
                String tempName = name.toString().substring(0,email.indexOf('.'));
                System.out.println("Temp name: "+tempName);
                
                name.append(tempName);
                name.append(name.substring(name.indexOf(".")));

            }
            
            
        }
        return 0;
    }
}
