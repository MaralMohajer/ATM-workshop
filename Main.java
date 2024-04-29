import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM");
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel language = new JPanel();
        language.setBounds(0, 0, 500, 500);
        language.setBackground(Color.lightGray);
        language.setLayout(new FlowLayout(FlowLayout.CENTER,35,200));

        JPanel code = new JPanel();
        code.setBounds(0, 0, 500, 500);
        code.setBackground(Color.lightGray);
        code.setLayout(new GridLayout(3, 1, 200, 100));

        JPanel amaliat = new JPanel();
        amaliat.setBounds(0, 0, 500, 500);
        amaliat.setBackground(Color.lightGray);
        amaliat.setLayout(new GridLayout(2, 2, 300,100));

        JPanel changeCode = new JPanel();
        changeCode.setBounds(0, 0, 500, 500);
        changeCode.setBackground(Color.lightGray);
        changeCode.setLayout(new GridLayout(3, 1, 200, 100));

        JPanel MOJODI = new JPanel();
        MOJODI.setBounds(0, 0, 500, 500);
        MOJODI.setBackground(Color.lightGray);
        MOJODI.setLayout(null);

        JPanel ENTEGJAL = new JPanel();
        ENTEGJAL.setBounds(0, 0, 500, 500);
        ENTEGJAL.setBackground(Color.lightGray);
        ENTEGJAL.setLayout(new GridLayout(5, 1, 100, 30));

        JPanel BARDASHT = new JPanel();
        BARDASHT.setBounds(0, 0, 500, 500);
        BARDASHT.setBackground(Color.lightGray);
        BARDASHT.setLayout(new GridLayout(3, 1, 200, 100));

        JPanel done = new JPanel();
        done.setBounds(0, 0, 500, 500);
        done.setBackground(Color.lightGray);
        done.setLayout(new FlowLayout(FlowLayout.CENTER,35,200));




//language panel
        JLabel zaban = new JLabel("زبان خود را وارد کنید");
        JLabel Language = new JLabel("choose language");
        JButton english = new JButton("english");
        english.setBackground(Color.GRAY);
        JButton persian = new JButton("persian");
        persian.setBackground(Color.GRAY);


        language.add(english);
        language.add(Language);
        language.add(zaban);
        language.add(persian);

        persian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(language);
                frame.add(code);
                frame.revalidate();
                frame.repaint();
            }
        });

//done


//code panel
        JLabel enterCode = new JLabel("رمز خود را وارد کنید");
        JTextField EnterCode = new JTextField();
        JButton Enter = new JButton("ثبت");
        Enter.setBackground(Color.GRAY);

        code.add(enterCode);
        code.add(EnterCode);
        code.add(Enter);

        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(code);
                frame.add(amaliat);
                frame.revalidate();
                frame.repaint();
            }
        });
//done


//amaliat panel
        JButton reCode = new JButton("تغییر رمز");
        reCode.setBackground(Color.GRAY);
        reCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(amaliat);
                frame.add(changeCode);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton mojodi = new JButton("اعلام موجودی");
        mojodi.setBackground(Color.GRAY);
        mojodi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(amaliat);
                frame.add(MOJODI);
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton enteghal = new JButton("انتقال وجه");
        enteghal.setBackground(Color.GRAY);
        enteghal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(amaliat);
                frame.add(ENTEGJAL);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton bardasht = new JButton("برداشت وجه");
        bardasht.setBackground(Color.GRAY);
        bardasht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(amaliat);
                frame.add(BARDASHT);
                frame.revalidate();
                frame.repaint();
            }
        });

        amaliat.add(enteghal);amaliat.add(reCode);
        amaliat.add(bardasht);amaliat.add(mojodi);
//done



//change code panel
        JLabel enterNewCode = new JLabel("رمز جدید را وارد کنید");
        JTextField newCode = new JTextField();
        newCode.getText();
        JButton confirmCode = new JButton("ثبت");
        confirmCode.setBackground(Color.GRAY);

        confirmCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(changeCode);
                frame.add(done);
                frame.revalidate();
                frame.repaint();
            }
        });
        changeCode.add(enterNewCode);
        changeCode.add(newCode);
        changeCode.add(confirmCode);

//done


//MOJODI panel
        JLabel elamMojodi = new JLabel("موجودی شما : 1,000,000 ریال");
        elamMojodi.setBounds(190,100,150,150);
        JButton confirmMojodi = new JButton("ثبت");
        confirmMojodi.setBounds(150, 300,200,50);
        confirmMojodi.setBackground(Color.GRAY);
        confirmMojodi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(MOJODI);
                frame.add(done);
                frame.revalidate();
                frame.repaint();
            }
        });

        MOJODI.add(elamMojodi);
        MOJODI.add(confirmMojodi);
//done


//enteghal panel
        JLabel enterCartNumber = new JLabel("شماره کارت مقصد را وارد کنید");
        JTextField cartNumber = new JTextField();
        cartNumber.getText();
        JLabel enterValue = new JLabel("مبلغ ر وارد کنید");
        JTextField value = new JTextField();
        value.getText();
        JButton confirmEnteghal = new JButton("ثبت");
        confirmEnteghal.setBackground(Color.GRAY);
        confirmEnteghal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(ENTEGJAL);
                frame.add(done);
                frame.revalidate();
                frame.repaint();
            }
        });

        ENTEGJAL.add(enterCartNumber);
        ENTEGJAL.add(cartNumber);
        ENTEGJAL.add(enterValue);
        ENTEGJAL.add(value);
        ENTEGJAL.add(confirmEnteghal);
//done


//BARDASHT panel
        JLabel enterMablagh = new JLabel("مبلغ مورد نیاز را وارد کنید");
        JTextField Mablagh = new JTextField();
        Mablagh.getText();
        JButton confirmBardasht = new JButton("ثبت");
        confirmBardasht.setBackground(Color.gray);

        confirmBardasht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(BARDASHT);
                frame.add(done);
                frame.revalidate();
                frame.repaint();
            }
        });

        BARDASHT.add(enterMablagh);
        BARDASHT.add(Mablagh);
        BARDASHT.add(confirmBardasht);

//done


//done panel
        JLabel success = new JLabel("عملیات با موفقیت انجام شد");
        done.add(success);
//done


        frame.add(language);
        frame.setVisible(true);


    }
}