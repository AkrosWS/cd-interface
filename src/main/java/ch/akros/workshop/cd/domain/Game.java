package ch.akros.workshop.cd.domain;

import ch.akros.workshop.cd.domain.Player;
import ch.akros.workshop.cd.exception.GameAlreadyInPlayException;
import ch.akros.workshop.cd.exception.NotEnoughPlayerException;

public interface Game {

	void subscribe(Player player);

	void run() throws NotEnoughPlayerException, GameAlreadyInPlayException;

}