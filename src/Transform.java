import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Transform implements ItemListener, ActionListener {
    String str;
    JTextField input;
    JTextField outDec,outOct,outHex,outBin;

    Transform(JTextField input,JTextField outDec,JTextField outOct,JTextField outHex,JTextField outBin)
    {
        this.input=input;
        this.outDec=outDec;
        this.outOct=outOct;
        this.outHex=outHex;
        this.outBin=outBin;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=input.getText();
        if(str=="十进制")
        {
        outDec.setText(s);
        int d=Integer.parseInt(s);
        outBin.setText(Integer.toBinaryString(d));
        outHex.setText(Integer.toHexString(d));
        outOct.setText(Integer.toOctalString(d));

        }
        if(str=="八进制")
        {
            outOct.setText(s);
            int d=Integer.parseInt(s,8);
            outBin.setText(Integer.toBinaryString(d));
            outDec.setText(String.valueOf(d));
            outHex.setText(Integer.toHexString(d));


        }
        if(str=="二进制")
        {
            outBin.setText(s);
            int d=Integer.parseInt(s,2);
            outDec.setText(String.valueOf(d));
            outOct.setText(Integer.toOctalString(d));
            outHex.setText(Integer.toHexString(d));


        }
        if(str=="十六进制")
        {
            outHex.setText(s);
            int d=Integer.parseInt(s,16);
            outDec.setText(String.valueOf(d));
            outOct.setText(Integer.toOctalString(d));
            outBin.setText(Integer.toBinaryString(d));

        }




    }

    @Override
    public void itemStateChanged(ItemEvent e) {
         str=e.getItem().toString();


    }
}
