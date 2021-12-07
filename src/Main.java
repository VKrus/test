public class Main {

    public static void main(String[] args) {

        MedicalCenter m = new MedicalCenter();
        m.addPatientToQueue(m.new Patient("Patient1",true, 10));
        m.addPatientToQueue(m.new Patient("Patient2",false, 9));
        m.addPatientToQueue(m.new Patient("Patient3",true, 11));
        m.addPatientToQueue(m.new Patient("Patient4",false, 10));
        m.addPatientToQueue(m.new Patient("Patient5",true, 15));
        m.addPatientToQueue(m.new Patient("Patient6",true, 17));

        while(!m.getQueue().isEmpty()){
            System.out.println(m.getQueue().remove());
        }
    }

}
