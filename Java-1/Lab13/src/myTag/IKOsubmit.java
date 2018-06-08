package myTag;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class IKOsubmit extends TagSupport {

    public int doStartTag() throws JspException {
        String in = "<input type=\"submit\" value=\"OK\"><br/>"
                + "<input type=\"reset\" value=\"Cancel\"><br/>";

        JspWriter out = pageContext.getOut();
        try {
            out.print(in);
        } catch (IOException e) {
            System.out.println("IKOSubmit: " + e);
        }
        return EVAL_BODY_INCLUDE;
    }
}