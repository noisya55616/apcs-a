public class MasterOrder {
    private List<CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int total = 0;

        for (int i = 0; i < orders.size(); i++) {
            total += orders.get(i).getNumBoxes();
        }
    }

    public int removeVariety(String cookieVar) {
        int total = 0;
        for (int i = orders.size() - 1; i >= 0; i--) {
            // This works without having to do anything to the index 
            // because when we go from max to min index, even when we
            // remove an element, the index of the next element does
            // not change.
            if (orders.get(i).getVariety().equals(cookieVar)) {
                total += orders.get(i).getNumBoxes();
                orders.remove(i);
            }
        }

        return total;
    }
}