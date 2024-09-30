package poly.ex.pay0;

public class PayService {

    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        if (option.equals("kakao")) {
            setPayment(new KakaoPay());
            result = payment.pay(amount);
        } else if (option.equals("naver")) {
            setPayment(new NaverPay());
            result = payment.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
