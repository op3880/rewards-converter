import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardsConverter.RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardsConverter.RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue=100;
        var rewardValue=new RewardsConverter.RewardValue(cashValue);
        System.out.println("$"+ cashValue+" is equal to "+rewardValue.getMilesValue()+" miles.");
    }

    @Test
    void convert_from_miles_to_cash() {
        int mileValue=10000;
        var rewardValue=new RewardsConverter.RewardValue(mileValue);
        System.out.println(mileValue+" miles is equal to $"+rewardValue.getCashValue()+".");
    }
}