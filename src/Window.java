import javax.swing.*;

public class Window extends JFrame {

    JComboBox select;
    JTextField input;
    Box in;
    Box inputBox;
    JLabel label1,label2,label3;
    Box out;
    Box all;
    Box label3Box;
    JLabel dec,oct,hex,bin,topNote;
    JTextField outDec,outOct,outHex,outBin;
    Box decBOX,octBox,hexBox,binBox;
   Box top;
   Box topBox;
   JButton sure;
   Box sureBox;
Transform transform;
    Window()
    {
        //new**********************************
        sure=new JButton("转换");
        topNote=new JLabel("请先选择原数的进制");
         label1=new JLabel("请选择原数进制：");
         label2=new JLabel("转换结果");
         label3=new JLabel("请输入原数");
         dec=new JLabel("十进制:");
         oct=new JLabel("八进制:");
         hex=new JLabel("十六进制:");
         bin=new JLabel("二进制:");
        inputBox =Box.createHorizontalBox();
         outDec=new JTextField();
         outOct=new JTextField();
         outHex=new JTextField();
         outBin=new JTextField();

        select=new JComboBox();
        input=new JTextField();
      transform=new Transform(input,outDec,outOct,outHex,outBin);
        // set*********************************

         outDec.setEditable(false);
         outBin.setEditable(false);
         outOct.setEditable(false);
         outHex.setEditable(false);
         select.addItem("请选择");
         select.addItem("十进制");
         select.addItem("二进制");
         select.addItem("八进制");
         select.addItem("十六进制");

         select.addItemListener(transform);
         sure.addActionListener(transform);
        all=Box.createVerticalBox();
        in=Box.createVerticalBox();
        out=Box.createVerticalBox();
        decBOX=Box.createHorizontalBox();
        binBox=Box.createHorizontalBox();
        octBox=Box.createHorizontalBox();
        hexBox=Box.createHorizontalBox();
        top=Box.createHorizontalBox();
        label3Box=Box.createHorizontalBox();
        topBox=Box.createHorizontalBox();
        sureBox=Box.createHorizontalBox();
        sureBox.add(sure);
        topBox.add(topNote);
        label3Box.add(label3);
        top.add(label1);
        top.add(select);
        decBOX.add(dec);
        decBOX.add(outDec);
        binBox.add(bin);
        binBox.add(outBin);
        octBox.add(oct);
        octBox.add(outOct);
        inputBox.add(input);
        hexBox.add(hex);
        hexBox.add(outHex);
        in.add(topBox);
        in.add(Box.createVerticalStrut(10));
        in.add(top);
        in.add(Box.createVerticalStrut(38));
        in.add(label3Box);
        in.add(Box.createVerticalStrut(30));
        in.add(inputBox);
        in.add(sureBox);

        out.add(label2);
        out.add(Box.createVerticalStrut(40));
        out.add(decBOX);
        out.add(Box.createVerticalStrut(15));
        out.add(binBox);
        out.add(Box.createVerticalStrut(15));
        out.add(octBox);
        out.add(Box.createVerticalStrut(15));
        out.add(hexBox);
        all.add(in);
        all.add(Box.createVerticalStrut(40));
        all.add(out);

              add(all);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,500,500);
        setVisible(true);



    }
}
