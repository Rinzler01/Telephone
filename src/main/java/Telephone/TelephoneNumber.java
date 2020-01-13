package Telephone;

import java.util.regex.Pattern;

public class TelephoneNumber
{
    public String cellNo;

    public TelephoneNumber(String cellNo)
    {
        this.cellNo  = cellNo.replaceAll("\\p{Punct}", "");

    }


    public void setTeleNumber(String cellNo)
    {
        this.cellNo = cellNo;
    }

   /* public String removePunctuation(String cellNo)
    {
        return TelephoneNumber.cellNo.replaceAll("\\p{Punct}", "");

    }
*/


    public String isValid()
    {
        String tNum = cellNo.replace(" ", "");

        Pattern telephoneRegex = Pattern.compile("1[0-9]{10}");

        String s = "+";
        String cellNo1 = s.concat(tNum);
        return  cellNo1;

    }



}
