package ssa;

public class SimulatedBowling {

    int bowlingScores[][] = new int[3][10];

    public void bowl() {

	System.out.println("Frames\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tTotal");
	System.out.println("-----------------------------------------------"
		+ "-------------------------------------------------------");

	int totalScorePerSeries = 0;

	for (int j = 0; j < bowlingScores.length; j++) {

	    System.out.print("Game " + (j + 1) + "\t");

	    int totalScorePerGame = 0;

	    for (int i = 0; i < 10; i++) {

		int firstBall = getPinsKnockedDown(10);
		int secondBall = 0;
		int totalScorePerFrame;

		if (firstBall < 10) {
		    secondBall = getPinsKnockedDown(10 - firstBall);
		    totalScorePerFrame = firstBall + secondBall;

		    bowlingScores[j][i] = totalScorePerFrame;
		    totalScorePerGame += totalScorePerFrame;

		}

		else {
		    totalScorePerFrame = firstBall + secondBall;
		    bowlingScores[j][i] = totalScorePerFrame;
		    totalScorePerGame += totalScorePerFrame;

		}

		System.out.print("\t" + bowlingScores[j][i]);

	    }

	    totalScorePerSeries += totalScorePerGame;
	    System.out.print("\t" + totalScorePerGame);

	    System.out.println("");
	    System.out.println("-----------------------------------------------"
		    + "-------------------------------------------------------");
	}

	System.out.print("Total Series");

	System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + totalScorePerSeries);
	System.out.println("-----------------------------------------------"
		+ "-------------------------------------------------------");

    }

    // generates a random number between 1 up to numberOfPinsInPlay
    public int getPinsKnockedDown(int numberOfPinsInPlay) {

	int pinsKnockedDown = (int) (1 + Math.random() * numberOfPinsInPlay);

	return pinsKnockedDown;
    }

}