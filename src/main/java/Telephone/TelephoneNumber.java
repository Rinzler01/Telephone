package Telephone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneNumber
{
    public static String cellNo;

    public TelephoneNumber(String cellNo)
    {
        this.cellNo  = cellNo;

    }



    private String removePunctuation(String cellNo)
    {
        return TelephoneNumber.cellNo.replaceAll("\\p{Punct}", "");

    }

    public String isValid()
    {
        String tNum = removePunctuation(cellNo.replace(" ", ""));

        Pattern telephoneRegex = Pattern.compile("1[0-9]{10}");
        Matcher telephoneMatcher = telephoneRegex.matcher(cellNo);


        String s = "+";
        String cellNo1 = s.concat(tNum);
        return  cellNo1;
    }

    public String isValid2()
    {



        return cellNo;
    }



}
