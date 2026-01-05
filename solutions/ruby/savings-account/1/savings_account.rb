module SavingsAccount
  def self.interest_rate(balance)
    if balance >= 0 && balance < 1000
      return 0.5
    elsif balance >= 1000 && balance < 5000
      return 1.621
    elsif balance >= 5000
      return 2.475
    elsif balance < 0
      return 3.213
    end
  end

  def self.annual_balance_update(balance)
    interest_rate = self.interest_rate(balance)
    interest = balance * (interest_rate / 100)
    return interest + balance
  end

  def self.years_before_desired_balance(current_balance, desired_balance)
    i = 0
    while current_balance < desired_balance
      interest_rate = self.interest_rate(current_balance)
      interest = current_balance * (interest_rate / 100)
      current_balance += interest
      i += 1
    end
    return i
  end
end
