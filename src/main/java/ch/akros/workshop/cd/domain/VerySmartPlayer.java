package ch.akros.workshop.cd.domain;

public interface VerySmartPlayer extends Player {

	boolean keepPlaying(boolean[] board, int[] numberOfStick, int yourSticks);
}
