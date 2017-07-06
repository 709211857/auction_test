package com.austin.auction.service;

import java.io.BufferedReader;
import java.net.Socket;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.austin.auction.domain.ClientDao;

public class ClientAuctionBid {

	private Long timeLeft = new Date().getTime();
	private Socket socket;

	private boolean loginSuccess = false;
	private static final Logger LOG = LoggerFactory.getLogger(ClientAuctionBid.class);

	public ClientAuctionBid(ClientDao cdao) {

		try {
			// The logic is just for demo , not implement it
			String serverIP = cdao.getServerIP();
			int serverPort = Integer.parseInt(cdao.getServerPort());
			socket = new Socket(serverIP, serverPort);
			new Thread() {
				public void run() {
					while (true) {
						boolean b = new Date().getTime() - timeLeft >= 5 * 60 * 1000;
						if (b) {
							LOG.debug("Long time no bigging , server was connected");
							;
							System.exit(1);
						}
					}
				}
			}.start();
		} catch (Exception e) {
			LOG.debug("You dont able to conect to the server , please check your network");
			System.exit(0);
		}
		new Thread() {
			public void run() {
				BufferedReader br = null;

				while (true) {

					// The logic is just for demo , not implement it
					boolean timeIsExpried = true;
					boolean passWordValidation = true;
					if (timeIsExpried) {
						if (passWordValidation) {

							LOG.debug("Login is ok, you connect to Socket Server successfully!");
							// TBD
						} else {
							LOG.debug("Login is failiure, you connect to Socket Server successfully!");
							// TBD
						}

					} else {
						LOG.debug("Bidding is over, please choose other production!!");
					}

				}

			}
		}.start();

		while (true) {

			if (!loginSuccess) {

				String userName = cdao.getUsername();
				String password = cdao.getPassword();
				// do login validation
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			} else {
				LOG.debug("Bidding beginning");
			}

		}
	}

}
