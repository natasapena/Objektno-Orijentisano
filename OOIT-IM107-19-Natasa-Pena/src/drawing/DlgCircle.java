package drawing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Point;

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

public class DlgCircle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtXCenter;
	private JTextField txtYCenter;
	private JTextField txtRadius;
	private Circle circle;
	protected boolean commited;
	private JButton btnInnerColor;
	private JButton btnOutlieColor;
	private Color innerColor = Color.WHITE;
	private Color outlineColor = Color.BLACK;
	


	public static void main(String[] args) {
		try {
			DlgCircle dialog = new DlgCircle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCircle() {
		setTitle("Create/Modify Circle");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 172, 89));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblCenterOfCircle = new JLabel("<html><u>Center of Circle</u></html>");
			lblCenterOfCircle.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblCenterOfCircle = new GridBagConstraints();
			gbc_lblCenterOfCircle.insets = new Insets(0, 0, 5, 5);
			gbc_lblCenterOfCircle.gridx = 1;
			gbc_lblCenterOfCircle.gridy = 1;
			contentPanel.add(lblCenterOfCircle, gbc_lblCenterOfCircle);
		}
		{
			JLabel lblCoordinateXCenter = new JLabel("Coordinate X:");
			lblCoordinateXCenter.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblCoordinateXCenter = new GridBagConstraints();
			gbc_lblCoordinateXCenter.anchor = GridBagConstraints.WEST;
			gbc_lblCoordinateXCenter.insets = new Insets(0, 0, 5, 5);
			gbc_lblCoordinateXCenter.gridx = 1;
			gbc_lblCoordinateXCenter.gridy = 2;
			contentPanel.add(lblCoordinateXCenter, gbc_lblCoordinateXCenter);
		}
		{
			txtXCenter = new JTextField();
			GridBagConstraints gbc_txtXCenter = new GridBagConstraints();
			gbc_txtXCenter.gridwidth = 4;
			gbc_txtXCenter.insets = new Insets(0, 0, 5, 0);
			gbc_txtXCenter.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtXCenter.gridx = 2;
			gbc_txtXCenter.gridy = 2;
			contentPanel.add(txtXCenter, gbc_txtXCenter);
			txtXCenter.setColumns(10);
		}
		{
			JLabel lblCoordinateYCenter = new JLabel("Coordinate Y:");
			lblCoordinateYCenter.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblCoordinateYCenter = new GridBagConstraints();
			gbc_lblCoordinateYCenter.anchor = GridBagConstraints.WEST;
			gbc_lblCoordinateYCenter.insets = new Insets(0, 0, 5, 5);
			gbc_lblCoordinateYCenter.gridx = 1;
			gbc_lblCoordinateYCenter.gridy = 3;
			contentPanel.add(lblCoordinateYCenter, gbc_lblCoordinateYCenter);
		}
		{
			txtYCenter = new JTextField();
			GridBagConstraints gbc_txtYCenter = new GridBagConstraints();
			gbc_txtYCenter.gridwidth = 4;
			gbc_txtYCenter.insets = new Insets(0, 0, 5, 0);
			gbc_txtYCenter.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtYCenter.gridx = 2;
			gbc_txtYCenter.gridy = 3;
			contentPanel.add(txtYCenter, gbc_txtYCenter);
			txtYCenter.setColumns(10);
		}
		{
			JLabel lblRadius = new JLabel("Radius:");
			lblRadius.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_lblRadius = new GridBagConstraints();
			gbc_lblRadius.anchor = GridBagConstraints.WEST;
			gbc_lblRadius.insets = new Insets(0, 0, 5, 5);
			gbc_lblRadius.gridx = 1;
			gbc_lblRadius.gridy = 5;
			contentPanel.add(lblRadius, gbc_lblRadius);
		}
		{
			txtRadius = new JTextField();
			GridBagConstraints gbc_txtRadius = new GridBagConstraints();
			gbc_txtRadius.gridwidth = 4;
			gbc_txtRadius.insets = new Insets(0, 0, 5, 0);
			gbc_txtRadius.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtRadius.gridx = 2;
			gbc_txtRadius.gridy = 5;
			contentPanel.add(txtRadius, gbc_txtRadius);
			txtRadius.setColumns(10);
		}
		{
		}
		{
			JButton btnInnerColor_1 = new JButton("Inner Color");
			btnInnerColor_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					innerColor = JColorChooser.showDialog(null, "Choose inner color", btnInnerColor_1.getBackground());
					if(innerColor != null) {
						btnInnerColor_1.setBackground(innerColor);
					}
				}
			});
			btnInnerColor_1.setBackground(new Color(255, 255, 255));
			btnInnerColor_1.setForeground(new Color(0, 0, 0));
			GridBagConstraints gbc_btnInnerColor_1 = new GridBagConstraints();
			gbc_btnInnerColor_1.insets = new Insets(0, 0, 5, 5);
			gbc_btnInnerColor_1.gridx = 1;
			gbc_btnInnerColor_1.gridy = 6;
			contentPanel.add(btnInnerColor_1, gbc_btnInnerColor_1);
		}
		JButton btnOutlineColor = new JButton("Outline Color");
		btnOutlineColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outlineColor = JColorChooser.showDialog(null, "Choose outline color", btnOutlineColor.getBackground());
				if(outlineColor != null) {
					btnOutlineColor.setBackground(outlineColor);
				}
			}
		});
		btnOutlineColor.setBackground(new Color(255, 255, 255));
		btnOutlineColor.setForeground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnOutlineColor = new GridBagConstraints();
		gbc_btnOutlineColor.insets = new Insets(0, 0, 5, 5);
		gbc_btnOutlineColor.gridx = 1;
		gbc_btnOutlineColor.gridy = 7;
		contentPanel.add(btnOutlineColor, gbc_btnOutlineColor);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
						}
					});
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								if(txtXCenter.getText().isEmpty() || txtYCenter.getText().isEmpty() || txtRadius.getText().isEmpty()) {
									JOptionPane.showMessageDialog(null, "All field are required!", "ERROR", JOptionPane.ERROR_MESSAGE);
								} else if(Integer.parseInt(txtRadius.getText().toString()) < 0 ||
											Integer.parseInt(txtXCenter.getText().toString())<0 || Integer.parseInt(txtYCenter.getText().toString())<0){
									JOptionPane.showMessageDialog(null, "Insert values greather than 0!", "ERROR", JOptionPane.ERROR_MESSAGE);
								} else {
									circle = new Circle (new Point(Integer.parseInt(txtXCenter.getText().toString()), Integer.parseInt(txtYCenter.getText().toString())),
											Integer.parseInt(txtRadius.getText().toString()), false, outlineColor, innerColor);
									commited = true;
									setVisible(false);
								}
							} catch(Exception e2) {
								JOptionPane.showMessageDialog(null, "Enter numbers only!", "ERROR", JOptionPane.ERROR_MESSAGE);
							}
						}
					});
					okButton.setForeground(new Color(0, 0, 0));
					okButton.setBackground(new Color(255, 255, 255));
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
					cancelButton.setBackground(new Color(255, 255, 255));
					cancelButton.setForeground(new Color(0, 0, 0));
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
		}
		
	}

	public JTextField getTxtXCenter() {
		return txtXCenter;
	}

	public void setTxtXCenter(JTextField txtXCenter) {
		this.txtXCenter = txtXCenter;
	}

	public JTextField getTxtYCenter() {
		return txtYCenter;
	}

	public void setTxtYCenter(JTextField txtYCenter) {
		this.txtYCenter = txtYCenter;
	}

	public JTextField getTxtRadius() {
		return txtRadius;
	}

	public void setTxtRadius(JTextField txtRadius) {
		this.txtRadius = txtRadius;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
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

	public JButton getBtnOutlieColor() {
		return btnOutlieColor;
	}

	public void setBtnOutlieColor(JButton btnOutlieColor) {
		this.btnOutlieColor = btnOutlieColor;
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