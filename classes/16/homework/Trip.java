public class Trip {
    private ArrayList<Flight> flights;

    public int getDuration() {
        if (flights.isEmpty()) return 0;
        return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size()).getArrivalTime());
    }

    public int getShortestLayover() {
        if (flights.size() < 2) return -1;
        int minLayover = flights.get(0).getArrivalTime().minutesUntil(flights.get(1).getDepartureTime());
        for (int i = 1; i + 1 < flights.size()) {
            int layover = int minLayover = flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime());
            if (layover > minLayover) minLayover = layover;
        }
        return minLayover;
    }
}