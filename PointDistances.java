public doible averageDistanceBetween(int x1, int y1, int x2, int y2. int x3, int y3) {
	double distanceBetween1and2 = Math.hypot(x1-x2, y1-y2);
	double distanceBetween1and3 = Math.hypot(x1-x3, y1-y3);
	double distanceBetween2and3 = Math.hypot(x2-x3, y2-y3);

	return (distanceBetween1and2 + distanceBetween2and3 + distanceBetween1and3) / 3
}