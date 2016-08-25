package ssa;

public class SimulatedBowling {

    int bowlingScores[][] = new int[3][10];

    public void bowlingScores() {

	int j = 0;
	for (; j < bowlingScores.length; j++) {

	    int i = 0;

	    int totalScorePerGame = 0;

	    for (; i < 10; i++) {

		int firstThrow = getPinsKnockedDown();
		int totalScorePerFrame;
		int secondThrow = 0;

		if (firstThrow < 10) {
		    secondThrow = getPinsKnockedDown(10 - firstThrow);
		    totalScorePerFrame = firstThrow + secondThrow;

		    bowlingScores[j][i] = totalScorePerFrame;
		    totalScorePerGame =+ totalScorePerFrame;

		}

		else {
		    totalScorePerFrame = firstThrow + secondThrow;
		    bowlingScores[j][i] = totalScorePerFrame;
		    totalScorePerGame =+ totalScorePerFrame;

		}
		System.out.print(bowlingScores[j][i] + "\t");

	    }

	    System.out.println();
	}

    }

    public int getPinsKnockedDown() {

	int pinsKnockedDown = (int) (1 + Math.random() * 10);

	return pinsKnockedDown;
    }

    public int getPinsKnockedDown(int remainingPins) {

	int pinsKnockedDown = (int) (1 + Math.random() * remainingPins);

	return pinsKnockedDown;
    }

}