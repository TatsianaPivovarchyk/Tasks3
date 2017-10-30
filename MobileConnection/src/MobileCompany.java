import Tariffs.Tariffs;
import Account.Account;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MobileCompany {

    private List<Account> accounts = new ArrayList<>();
    private List<Tariffs> tariffs = new ArrayList<>();
    private List<Tariffs> filteredTariffs = new ArrayList<>();


    public MobileCompany() {

    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Tariffs> getTariffs() {
        return tariffs;
    }

    public void addTariffs(Tariffs tariff) {
        tariffs.add(tariff);
    }

    public Set<String> getClients() {
        Set<String> clients = new HashSet<>();
        for (Account account : accounts) {
            clients.add(account.getClientName());
        }
        return clients;
    }


}
