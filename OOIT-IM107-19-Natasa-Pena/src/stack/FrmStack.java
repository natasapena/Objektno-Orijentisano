package stack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.border.LineBorder;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmStack extends JFrame {

	private JPanel contentPane;
	DefaultListModel<String> dlm = new DefaultListModel<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStack frame = new FrmStack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmStack() {
		setTitle("IM107/19 Natasa Pena");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 172, 89));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlStack = new JPanel();
		pnlStack.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnlStack.setForeground(new Color(0, 0, 0));
		pnlStack.setBackground(new Color(255, 255, 255));
		pnlStack.setBounds(10, 45, 369, 328);
		contentPane.add(pnlStack);
		GridBagLayout gbl_pnlStack = new GridBagLayout();
		gbl_pnlStack.columnWidths = new int[]{0, 0};
		gbl_pnlStack.rowHeights = new int[]{0, 0};
		gbl_pnlStack.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlStack.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlStack.setLayout(gbl_pnlStack);
		
		JButton btnAdd = new JButton("Add Rectangle");
		btnAdd.setBounds(151, 21, 103, 23);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgStack rect = new DlgStack();
				rect.setVisible(true);
				if(rect.commited) {
					String element = ("Upper left point: ( " + rect.getTxtX().getText() + " " + "," + " " + rect.getTxtY().getText() + " " + ") , width: " + rect.getTxtWidth().getText() + " , height: " + rect.getTxtHeight().getText());
					dlm.add(0, element);
				}
			}
		});
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setForeground(new Color(0, 0, 0));
		
		JButton btnDelete = new JButton("Delete Rectangle");
		btnDelete.setBounds(10, 21, 115, 23);
		contentPane.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dlm.isEmpty()) {
					JOptionPane.showMessageDialog(null, "List is empty!", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					DlgStack dlgDelete = new DlgStack();
					String[] split= dlm.getElementAt(0).toString().split(" ");
					int index = 0;
					dlgDelete.getTxtX().setText(split[4]);
					dlgDelete.getTxtY().setText(split[6]);
					dlgDelete.getTxtWidth().setText(split[10]);
					dlgDelete.getTxtHeight().setText(split[13]);
					dlgDelete.getTxtX().setEditable(false);
					dlgDelete.getTxtY().setEditable(false);
					dlgDelete.getTxtWidth().setEditable(false);
					dlgDelete.getTxtHeight().setEditable(false);
					dlgDelete.setVisible(true);
					
					if(dlgDelete.commited) {
						dlm.remove(index);
					}
				}
			}
		});
		btnDelete.setBackground(new Color(255, 255, 255));
		btnDelete.setForeground(new Color(0, 0, 0));
		
		JList listStack = new JList();
		listStack.setBackground(new Color(255, 172, 89));
		listStack.setBounds(108, 11, 271, 374);
		contentPane.add(listStack);
		listStack.setModel(dlm);
		
	}
}
