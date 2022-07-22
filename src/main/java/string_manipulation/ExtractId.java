/*1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
Output: TXN123456*/
package string_manipulation;

public class ExtractId {
    public static void main(String[] args) {
        String str = "<html>\n" + "<title>Test</title>\n" + "<body>\n" + "Your trnx is successful. Trnx Id is: TXN123456\n"
                + "</body>\n" + "</html>\n";


        System.out.println("transaction ID is :"+str.substring(str.indexOf("TXN123456")));

    }
}