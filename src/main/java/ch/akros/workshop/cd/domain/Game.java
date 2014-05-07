package ch.akros.workshop.cd.domain;

import ch.akros.workshop.cd.exception.GameAlreadyInPlayException;
import ch.akros.workshop.cd.exception.NotEnoughPlayerException;

public interface Game {

	void subscribe(String jndiName, String playerName);

	void run() throws NotEnoughPlayerException, GameAlreadyInPlayException;

}