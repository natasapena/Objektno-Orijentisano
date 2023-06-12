package drawing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import geometry.Point;
import geometry.Line;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DlgLine extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtStartX;
	private JTextField txtStartY;
	private JTextField txtEndX;
	private JTextField txtEndY;
	private Line line;
	protected boolean commited;
	private JButton btnColor;
	private Color outlineColor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgLine dialog = new DlgLine();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgLine() {
		setTitle ("Modify Line");
		setModal (true);
		setResizable (false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 172, 89));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 19, 0, 0, 53, -16, 45, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblStartPoint = new JLabel("<html><u>Start Point</u></html>");
			lblStartPoint.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblStartPoint = new GridBagConstraints();
			gbc_lblStartPoint.insets = new Insets(0, 0, 5, 5);
			gbc_lblStartPoint.gridx = 1;
			gbc_lblStartPoint.gridy = 1;
			contentPanel.add(lblStartPoint, gbc_lblStartPoint);
		}
		{
			JLabel lblStartX = new JLabel("Coordinate X:");
			lblStartX.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblStartX = new GridBagConstraints();
			gbc_lblStartX.anchor = GridBagConstraints.EAST;
			gbc_lblStartX.insets = new Insets(0, 0, 5, 5);
			gbc_lblStartX.gridx = 1;
			gbc_lblStartX.gridy = 2;
			contentPanel.add(lblStartX, gbc_lblStartX);
		}
		{
			txtStartX = new JTextField();
			GridBagConstraints gbc_txtStartX = new GridBagConstraints();
			gbc_txtStartX.gridwidth = 3;
			gbc_txtStartX.insets = new Insets(0, 0, 5, 0);
			gbc_txtStartX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtStartX.gridx = 2;
			gbc_txtStartX.gridy = 2;
			contentPanel.add(txtStartX, gbc_txtStartX);
			txtStartX.setColumns(10);
		}
		{
			JLabel lblStartY = new JLabel("Coordinate Y:");
			lblStartY.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblStartY = new GridBagConstraints();
			gbc_lblStartY.anchor = GridBagConstraints.EAST;
			gbc_lblStartY.insets = new Insets(0, 0, 5, 5);
			gbc_lblStartY.gridx = 1;
			gbc_lblStartY.gridy = 3;
			contentPanel.add(lblStartY, gbc_lblStartY);
		}
		{
			txtStartY = new JTextField();
			GridBagConstraints gbc_txtStartY = new GridBagConstraints();
			gbc_txtStartY.gridwidth = 3;
			gbc_txtStartY.anchor = GridBagConstraints.NORTH;
			gbc_txtStartY.insets = new Insets(0, 0, 5, 0);
			gbc_txtStartY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtStartY.gridx = 2;
			gbc_txtStartY.gridy = 3;
			contentPanel.add(txtStartY, gbc_txtStartY);
			txtStartY.setColumns(10);
		}
		{
			JLabel lblEndPoint = new JLabel("<html><u>End Point</u></html>");
			lblEndPoint.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblEndPoint = new GridBagConstraints();
			gbc_lblEndPoint.insets = new Insets(0, 0, 5, 5);
			gbc_lblEndPoint.gridx = 1;
			gbc_lblEndPoint.gridy = 5;
			contentPanel.add(lblEndPoint, gbc_lblEndPoint);
		}
		{
			JLabel lblEndX = new JLabel("Coordinate X:");
			lblEndX.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblEndX = new GridBagConstraints();
			gbc_lblEndX.anchor = GridBagConstraints.EAST;
			gbc_lblEndX.insets = new Insets(0, 0, 5, 5);
			gbc_lblEndX.gridx = 1;
			gbc_lblEndX.gridy = 6;
			contentPanel.add(lblEndX, gbc_lblEndX);
		}
		{
			txtEndX = new JTextField();
			GridBagConstraints gbc_txtEndX = new GridBagConstraints();
			gbc_txtEndX.gridwidth = 3;
			gbc_txtEndX.insets = new Insets(0, 0, 5, 0);
			gbc_txtEndX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtEndX.gridx = 2;
			gbc_txtEndX.gridy = 6;
			contentPanel.add(txtEndX, gbc_txtEndX);
			txtEndX.setColumns(10);
		}
		{
			JLabel lblEndY = new JLabel("Coordinate Y:");
			lblEndY.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblEndY = new GridBagConstraints();
			gbc_lblEndY.anchor = GridBagConstraints.EAST;
			gbc_lblEndY.insets = new Insets(0, 0, 5, 5);
			gbc_lblEndY.gridx = 1;
			gbc_lblEndY.gridy = 7;
			contentPanel.add(lblEndY, gbc_lblEndY);
		}
		{
			txtEndY = new JTextField();
			GridBagConstraints gbc_txtEndY = new GridBagConstraints();
			gbc_txtEndY.gridwidth = 3;
			gbc_txtEndY.insets = new Insets(0, 0, 5, 0);
			gbc_txtEndY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtEndY.gridx = 2;
			gbc_txtEndY.gridy = 7;
			contentPanel.add(txtEndY, gbc_txtEndY);
			txtEndY.setColumns(10);
		}
		{
			JButton btnColor = new JButton("Select color");
			btnColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					outlineColor = JColorChooser.showDialog(null, "Choose outline color ", btnColor.getBackground());
					if (outlineColor != null) {
						btnColor.setBackground(outlineColor);
					}
				}
			});
			btnColor.setBackground(new Color(255, 255, 255));
			btnColor.setForeground(new Color(216, 191, 216));
			GridBagConstraints gbc_btnColor = new GridBagConstraints();
			gbc_btnColor.insets = new Insets(0, 0, 5, 5);
			gbc_btnColor.gridx = 3;
			gbc_btnColor.gridy = 9;
			contentPanel.add(btnColor, gbc_btnColor);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							if (txtStartX.getText().isEmpty() || txtStartY.getText().isEmpty() || txtEndX.getText().isEmpty() || txtEndY.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "All fields are required!", "ERROR", JOptionPane.ERROR_MESSAGE);
							} else if (Integer.parseInt(txtStartX.getText().toString())<0 || Integer.parseInt(txtStartY.getText().toString())<0
										|| Integer.parseInt(txtEndX.getText().toString())<0 || Integer.parseInt(txtEndY.getText().toString())<0) {
								JOptionPane.showMessageDialog(null, "Insert values greater than 0!", "ERROR", JOptionPane.ERROR_MESSAGE);
							} else {
								line = new Line (new Point(Integer.parseInt(txtStartX.getText().toString()), Integer.parseInt(txtStartY.getText().toString())),
										new Point(Integer.parseInt(txtEndX.getText().toString()), Integer.parseInt(txtEndY.getText().toString())), false, outlineColor);
								commited = true;
								dispose();
							}
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Enter numbers only!", "ERROR", JOptionPane.ERROR_MESSAGE);
						} 
					}
				
				});
				okButton.setBackground(new Color(255, 255, 255));
				okButton.setForeground(new Color(0, 0, 0));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBackground(new Color(255, 255, 255));
				cancelButton.setForeground(new Color(0, 0, 0));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
	}

	public JTextField getTxtStartX() {
		return txtStartX;
	}

	public void setTxtStartX(JTextField txtStartX) {
		this.txtStartX = txtStartX;
	}

	public JTextField getTxtStartY() {
		return txtStartY;
	}

	public void setTxtStartY(JTextField txtStartY) {
		this.txtStartY = txtStartY;
	}

	public JTextField getTxtEndX() {
		return txtEndX;
	}

	public void setTxtEndX(JTextField txtEndX) {
		this.txtEndX = txtEndX;
	}

	public JTextField getTxtEndY() {
		return txtEndY;
	}

	public void setTxtEndY(JTextField txtEndY) {
		this.txtEndY = txtEndY;
	}

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public JButton getBtnColor() {
		return btnColor;
	}

	public void setBtnColor(JButton btnColor) {
		this.btnColor = btnColor;
	}

	public Color getOutlineColor() {
		return outlineColor;
	}

	public void setOutlineColor(Color outlineColor) {
		this.outlineColor = outlineColor;
	}

}
