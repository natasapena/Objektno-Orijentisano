package drawing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Point;
import geometry.Rectangle;

import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgRectangle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUpperX;
	private JTextField txtHeight;
	private JTextField txtWidth;
	private JTextField txtUpperY;
	private Rectangle rectangle;
	protected boolean commited;
	private JButton btnInnerColor;
	private JButton btnOutlineColor;
	private Color innerColor = Color.WHITE;
	private Color outlineColor = Color.BLACK;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRectangle dialog = new DlgRectangle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRectangle() {
		setTitle("Create/Modify Rectangle");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblUpperLeftPoint = new JLabel("<html><u>Upper left Point</u></html>");
			lblUpperLeftPoint.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblUpperLeftPoint = new GridBagConstraints();
			gbc_lblUpperLeftPoint.anchor = GridBagConstraints.WEST;
			gbc_lblUpperLeftPoint.insets = new Insets(0, 0, 5, 5);
			gbc_lblUpperLeftPoint.gridx = 1;
			gbc_lblUpperLeftPoint.gridy = 1;
			contentPanel.add(lblUpperLeftPoint, gbc_lblUpperLeftPoint);
		}
		{
			JLabel lblUpperLeftPointX = new JLabel("Coordinate X:");
			lblUpperLeftPointX.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblUpperLeftPointX = new GridBagConstraints();
			gbc_lblUpperLeftPointX.anchor = GridBagConstraints.WEST;
			gbc_lblUpperLeftPointX.insets = new Insets(0, 0, 5, 5);
			gbc_lblUpperLeftPointX.gridx = 1;
			gbc_lblUpperLeftPointX.gridy = 2;
			contentPanel.add(lblUpperLeftPointX, gbc_lblUpperLeftPointX);
		}
		{
			txtUpperX = new JTextField();
			GridBagConstraints gbc_txtUpperX = new GridBagConstraints();
			gbc_txtUpperX.gridwidth = 4;
			gbc_txtUpperX.insets = new Insets(0, 0, 5, 0);
			gbc_txtUpperX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtUpperX.gridx = 2;
			gbc_txtUpperX.gridy = 2;
			contentPanel.add(txtUpperX, gbc_txtUpperX);
			txtUpperX.setColumns(10);
		}
		{
			JLabel lblUpperLeftPointY = new JLabel("Coordinate Y:");
			lblUpperLeftPointY.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblUpperLeftPointY = new GridBagConstraints();
			gbc_lblUpperLeftPointY.anchor = GridBagConstraints.WEST;
			gbc_lblUpperLeftPointY.insets = new Insets(0, 0, 5, 5);
			gbc_lblUpperLeftPointY.gridx = 1;
			gbc_lblUpperLeftPointY.gridy = 3;
			contentPanel.add(lblUpperLeftPointY, gbc_lblUpperLeftPointY);
		}
		{
			txtUpperY = new JTextField();
			GridBagConstraints gbc_txtUpperY = new GridBagConstraints();
			gbc_txtUpperY.gridwidth = 4;
			gbc_txtUpperY.insets = new Insets(0, 0, 5, 0);
			gbc_txtUpperY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtUpperY.gridx = 2;
			gbc_txtUpperY.gridy = 3;
			contentPanel.add(txtUpperY, gbc_txtUpperY);
			txtUpperY.setColumns(10);
		}
		{
			JLabel lblWidth = new JLabel("Width:");
			lblWidth.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblWidth = new GridBagConstraints();
			gbc_lblWidth.anchor = GridBagConstraints.WEST;
			gbc_lblWidth.insets = new Insets(0, 0, 5, 5);
			gbc_lblWidth.gridx = 1;
			gbc_lblWidth.gridy = 5;
			contentPanel.add(lblWidth, gbc_lblWidth);
		}
		{
			txtWidth = new JTextField();
			GridBagConstraints gbc_txtWidth = new GridBagConstraints();
			gbc_txtWidth.gridwidth = 4;
			gbc_txtWidth.insets = new Insets(0, 0, 5, 0);
			gbc_txtWidth.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtWidth.gridx = 2;
			gbc_txtWidth.gridy = 5;
			contentPanel.add(txtWidth, gbc_txtWidth);
			txtWidth.setColumns(10);
		}
		{
			JLabel lblHeight = new JLabel("Height:");
			lblHeight.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblHeight = new GridBagConstraints();
			gbc_lblHeight.anchor = GridBagConstraints.WEST;
			gbc_lblHeight.insets = new Insets(0, 0, 5, 5);
			gbc_lblHeight.gridx = 1;
			gbc_lblHeight.gridy = 6;
			contentPanel.add(lblHeight, gbc_lblHeight);
		}
		{
			txtHeight = new JTextField();
			GridBagConstraints gbc_txtHeight = new GridBagConstraints();
			gbc_txtHeight.gridwidth = 4;
			gbc_txtHeight.insets = new Insets(0, 0, 5, 0);
			gbc_txtHeight.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtHeight.gridx = 2;
			gbc_txtHeight.gridy = 6;
			contentPanel.add(txtHeight, gbc_txtHeight);
			txtHeight.setColumns(10);
		}
		{
		}
		JButton btnInnerColor_1 = new JButton("Inner color");
		btnInnerColor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			innerColor = JColorChooser.showDialog(null, "Choose inner color", btnInnerColor_1.getBackground());
			if(innerColor != null) {
				btnInnerColor_1.setBackground(innerColor);
				}
			}
		});
		{
			JButton btnOutlineColor_1 = new JButton("Outline Color");
			btnOutlineColor_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				outlineColor = JColorChooser.showDialog(null, "Choose outline color", btnOutlineColor_1.getBackground());
				if(outlineColor != null) {
					btnOutlineColor_1.setBackground(outlineColor);
					}
				}
			});
			btnOutlineColor_1.setForeground(new Color(0, 0, 0));
			btnOutlineColor_1.setBackground(new Color(255, 255, 255));
			GridBagConstraints gbc_btnOutlineColor_1 = new GridBagConstraints();
			gbc_btnOutlineColor_1.insets = new Insets(0, 0, 5, 5);
			gbc_btnOutlineColor_1.gridx = 1;
			gbc_btnOutlineColor_1.gridy = 8;
			contentPanel.add(btnOutlineColor_1, gbc_btnOutlineColor_1);
		}
		btnInnerColor_1.setBackground(new Color(255, 255, 255));
		btnInnerColor_1.setForeground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnInnerColor_1 = new GridBagConstraints();
		gbc_btnInnerColor_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnInnerColor_1.gridx = 1;
		gbc_btnInnerColor_1.gridy = 9;
		contentPanel.add(btnInnerColor_1, gbc_btnInnerColor_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							if(txtUpperX.getText().isEmpty() || txtUpperY.getText().isEmpty() ||
									txtWidth.getText().isEmpty() || txtHeight.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "All values are required!", "ERROR", JOptionPane.ERROR_MESSAGE);
							} else if (Integer.parseInt(txtUpperX.getText().toString())<0 || Integer.parseInt(txtUpperY.getText().toString())<0 || 
									Integer.parseInt(txtWidth.getText().toString())<0 || Integer.parseInt(txtHeight.getText().toString())<0) {
										JOptionPane.showMessageDialog(null, "Insert values greater than 0!", "ERROR", JOptionPane.ERROR_MESSAGE);
							} else {
								rectangle = new Rectangle(new Point(Integer.parseInt(txtUpperX.getText().toString()), Integer.parseInt(txtUpperY.getText().toString())), Integer.parseInt(txtWidth.getText().toString()), Integer.parseInt(txtHeight.getText().toString()), false, outlineColor, innerColor);
								commited = true;
								setVisible(false);
							}
						} catch(NumberFormatException e1) {
							JOptionPane.showMessageDialog(null, "Enter numbers only!", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
						}
					});
					cancelButton.setForeground(new Color(0, 0, 0));
					cancelButton.setBackground(new Color(255, 255, 255));
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
				okButton.setForeground(new Color(0, 0, 0));
				okButton.setBackground(new Color(255, 255, 255));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	public JTextField getTxtUpperX() {
		return txtUpperX;
	}

	public void setTxtUpperX(JTextField txtUpperX) {
		this.txtUpperX = txtUpperX;
	}

	public JTextField getTxtHeight() {
		return txtHeight;
	}

	public void setTxtHeight(JTextField txtHeight) {
		this.txtHeight = txtHeight;
	}

	public JTextField getTxtWidth() {
		return txtWidth;
	}

	public void setTxtWidth(JTextField txtWidth) {
		this.txtWidth = txtWidth;
	}

	public JTextField getTxtUpperY() {
		return txtUpperY;
	}

	public void setTxtUpperY(JTextField txtUpperY) {
		this.txtUpperY = txtUpperY;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public JButton getBtnInnerColor() {
		return btnInnerColor;
	}

	public void setBtnInnerColor(JButton btnInnerColor) {
		this.btnInnerColor = btnInnerColor;
	}

	public JButton getBtnOutlineColor() {
		return btnOutlineColor;
	}

	public void setBtnOutlineColor(JButton btnOutlineColor) {
		this.btnOutlineColor = btnOutlineColor;
	}

	public Color getInnerColor() {
		return innerColor;
	}

	public void setInnerColor(Color innerColor) {
		this.innerColor = innerColor;
	}

	public Color getOutlineColor() {
		return outlineColor;
	}

	public void setOutlineColor(Color outlineColor) {
		this.outlineColor = outlineColor;
	}

}
