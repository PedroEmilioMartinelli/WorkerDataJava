package entitis;

import entitis.enums.WorkerLeval;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLeval leval;
    private Double BaseSalary;


    private Departament departament;

    private List<HourContract> contracts = new ArrayList<>();


    public Worker() {
    }

    public Worker(String name, WorkerLeval leval, Double baseSalary, Departament departament) {
        this.name = name;
        this.leval = leval;
        BaseSalary = baseSalary;
        this.departament = departament;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLeval getLeval() {
        return leval;
    }

    public void setLeval(WorkerLeval leval) {
        this.leval = leval;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }


    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }


    public double income(int year, int month) {
        double sum = BaseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime((c.getDate()));

            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();

            }


        }
        return sum;


    }
}




