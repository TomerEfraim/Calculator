package Calculator; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private String result = "";
	private Ex13 model;
	private CalculatorView view;
	private ActionListener zeroButtonListener;
	private ActionListener oneButtonListener;
	private ActionListener twoButtonListener;
	private ActionListener threeButtonListener;
	private ActionListener fourButtonListener;
	private ActionListener fiveButtonListener;
	private ActionListener sixButtonListener;
	private ActionListener sevenButtonListener;
	private ActionListener eightButtonListener;
	private ActionListener nineButtonListener;
	private ActionListener plusButtonListener;
	private ActionListener minusButtonListener;
	private ActionListener multiplyButtonListener;
	private ActionListener remainderButtonListener;
	private ActionListener equalsButtonListener;
	private ActionListener clearButtonListener;
	private ActionListener openParenButtonListener;
	private ActionListener closeParenButtonListener;

	public CalculatorController(Ex13 model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}

	public void controll() {
		zeroButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				zeroButtonActionPerformed();

			}
		};
		oneButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				oneButtonActionPerformed();

			}
		};
		twoButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				twoButtonActionPerformed();

			}
		};
		threeButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				threeButtonActionPerformed();

			}
		};
		fourButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				fourButtonActionPerformed();

			}
		};
		fiveButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				fiveButtonActionPerformed();

			}
		};
		sixButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				sixButtonActionPerformed();

			}
		};
		sevenButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sevenButtonActionPerformed();
			}
		};
		eightButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				eightButtonActionPerformed();
			}
		};
		nineButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				nineButtonActionPerformed();
			}
		};
		plusButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				plusButtonActionPerformed();
			}
		};
		minusButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				minusButtonActionPerformed();
			}
		};
		multiplyButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				mulButtonActionPerformed();
			}
		};
		remainderButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				remainderButtonActionPerformed();
			}
		};
		equalsButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				equalsButtonActionPerformed();
			}
		};
		clearButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				clearButtonActionPerformed();
			}
		};
		openParenButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				openParenButtonActionPerformed();
			}
		};
		closeParenButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				closeParenButtonActionPerformed();
			}
		};
		view.zeroButton.addActionListener(zeroButtonListener);
		view.oneButton.addActionListener(oneButtonListener);
		view.twoButton.addActionListener(twoButtonListener);
		view.threeButton.addActionListener(threeButtonListener);
		view.fourButton.addActionListener(fourButtonListener);
		view.fiveButton.addActionListener(fiveButtonListener);
		view.sixButton.addActionListener(sixButtonListener);
		view.sevenButton.addActionListener(sevenButtonListener);
		view.eightButton.addActionListener(eightButtonListener);
		view.nineButton.addActionListener(nineButtonListener);
		view.plusButton.addActionListener(plusButtonListener);
		view.minusButton.addActionListener(minusButtonListener);
		view.mulButton.addActionListener(multiplyButtonListener);
		view.remainderButton.addActionListener(remainderButtonListener);
		view.equalsButton.addActionListener(equalsButtonListener);
		view.clearButton.addActionListener(clearButtonListener);
		view.openParenButton.addActionListener(openParenButtonListener);
		view.closeParenButton.addActionListener(closeParenButtonListener);
	}

	private void sevenButtonActionPerformed() {
		view.resultTextField.setText(result + "7");
		result += "7";
	}

	private void zeroButtonActionPerformed() {
		view.resultTextField.setText(result + "0");
		result += "0";
	}

	private void oneButtonActionPerformed() {
		view.resultTextField.setText(result + "1");
		result += "1";
	}

	private void twoButtonActionPerformed() {
		view.resultTextField.setText(result + "2");
		result += "2";
	}

	private void threeButtonActionPerformed() {
		view.resultTextField.setText(result + "3");
		result += "3";
	}

	private void fourButtonActionPerformed() {
		view.resultTextField.setText(result + "4");
		result += "4";
	}

	private void fiveButtonActionPerformed() {
		view.resultTextField.setText(result + "5");
		result += "5";
	}

	private void sixButtonActionPerformed() {
		view.resultTextField.setText(result + "6");
		result += "6";
	}

	private void eightButtonActionPerformed() {
		view.resultTextField.setText(result + "8");
		result += "8";
	}

	private void nineButtonActionPerformed() {
		view.resultTextField.setText(result + "9");
		result += "9";
	}

	private void plusButtonActionPerformed() {
		view.resultTextField.setText(result + "+");
		result += "+";
	}

	private void minusButtonActionPerformed() {
		view.resultTextField.setText(result + "-");
		result += "-";
	}

	private void mulButtonActionPerformed() {
		view.resultTextField.setText(result + "*");
		result += "*";
	}

	private void remainderButtonActionPerformed() {
		view.resultTextField.setText(result + "%");
		result += "%";
	}

	private void equalsButtonActionPerformed() {
		view.resultTextField.setText(model.evalExpr2(result));
	}

	private void clearButtonActionPerformed() {
		view.resultTextField.setText("");
		result = "";
	}

	private void openParenButtonActionPerformed() {
		view.resultTextField.setText(result + "(");
		result += "(";
	}

	private void closeParenButtonActionPerformed() {
		view.resultTextField.setText(result + ")");
		result += ")";
	}
}
