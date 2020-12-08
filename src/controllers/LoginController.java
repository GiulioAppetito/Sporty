package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.LoginModel;
import views.HomeUI;
import views.LoginUI;

public class LoginController {

	private static LoginUI view;
	private LoginModel model;
	private static LoginController instance = null;

	private LoginController(LoginUI vista, LoginModel modello) {
		this.view = vista;
		this.model = modello;
	}

	public synchronized static LoginController getInstance(LoginUI vista,
			LoginModel model) {
		if (instance == null) {
			instance = new LoginController(vista, model);
		}
		showLoginUI();
		return instance;
	}

	//
	public void assegnaGestori() {

		ActionListener gestoreSignUp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e2) {
				// TODO Auto-generated method stub

				HomeUI homeView = new HomeUI();

				HomeController homeController = HomeController
						.getInstance(homeView);
				homeController.assegnaGestori();

				view.setVisible(false);

			}

		};

		view.getSignUpButton().addActionListener(gestoreSignUp);

		ActionListener gestoreDelete = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.resetForm();

			}

		};
		view.getDeleteButton().addActionListener(gestoreDelete);

	}
	public static void showLoginUI() {
		view.setVisible(true);
	}

}
