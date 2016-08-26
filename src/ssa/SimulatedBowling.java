package ssa;

public class SimulatedBowling {

    int bowlingScores[][] = new int[3][10];

    public void bowl() {

	System.out.println("Frames             1       2       3       4       5       6       7       8       9       10    Total");
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
		    if (totalScorePerFrame == 10)
			totalScorePerFrame = 12;

		    bowlingScores[j][i] = totalScorePerFrame;
		    totalScorePerGame += totalScorePerFrame;

		}

		else {
		    totalScorePerFrame = firstBall + secondBall;
		    if (totalScorePerFrame == 10)
			totalScorePerFrame = 15;
		    
		    bowlingScores[j][i] = totalScorePerFrame;
		    totalScorePerGame += totalScorePerFrame;

		}

		System.out.printf("\t%4d", bowlingScores[j][i]);

	    }

	    totalScorePerSeries += totalScorePerGame;
	    System.out.print("\t");
	    System.out.printf("%4d", totalScorePerGame );
	    

	    System.out.println("");
	    System.out.println("-----------------------------------------------"
		    + "-------------------------------------------------------");
	}

	System.out.print("Total Series");

	System.out.println("\t\t\t\t\t\t\t\t\t\t\t " + totalScorePerSeries);
	System.out.println("-----------------------------------------------"
		+ "-------------------------------------------------------");

    }

    // generates a random number between 1 up to numberOfPinsInPlay
    public int getPinsKnockedDown(int numberOfPinsInPlay) {

	int pinsKnockedDown = (int) (1 + Math.random() * numberOfPinsInPlay);

	return pinsKnockedDown;
    }

}