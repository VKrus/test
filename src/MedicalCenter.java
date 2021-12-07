import java.util.PriorityQueue;
import java.util.Queue;

public class MedicalCenter {

    private final double insurance = 1000;
    private final double discountForEmployee = 0.25;

    private Queue<Patient> queue = new PriorityQueue<>();

    public Queue<Patient> getQueue() {
        return queue;
    }

    public class Patient extends Person implements Comparable<Patient>{

        boolean hasTicket;
        int timeArrived;

        public Patient() {
            hasTicket = false;
        }

        public Patient(boolean hasTicket, int timeArrived) {
            super();
            this.hasTicket = hasTicket;
            this.timeArrived = timeArrived;
        }

        public Patient(String firstName, boolean hasTicket, int timeArrived) {
            super(firstName);
            this.hasTicket = hasTicket;
            this.timeArrived = timeArrived;
        }

        public boolean isHasTicket() {
            return hasTicket;
        }

        public void setHasTicket(boolean hasTicket) {
            this.hasTicket = hasTicket;
        }

        public int getTimeArrived() {
            return timeArrived;
        }

        public void setTimeArrived(int timeArrived) {
            this.timeArrived = timeArrived;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "hasTicket=" + hasTicket +
                    ", timeArrived=" + timeArrived +
                    '}';
        }

        @Override
        public int compareTo(Patient o) {
            return Integer.compare(this.getTimeArrived(), o.getTimeArrived());
        }
    }

    public void addPatientToQueue(Patient patient){
        queue.add(patient);
    }

    public double calculateCostOfInsurance(Person person){
        if(person instanceof Employee){
            return insurance - insurance * discountForEmployee;
        }
        return insurance;
    }

//    public Queue<Patient> therapistTraffic() {
//
//    }

}
