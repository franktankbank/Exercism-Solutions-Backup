class SimpleCalculator
  ALLOWED_OPERATIONS = ['+', '/', '*'].freeze

  class UnsupportedOperation < StandardError
  end
  
  def self.calculate(first_operand, second_operand, operation)
    if ALLOWED_OPERATIONS.include?(operation)
      if first_operand.is_a? Integer and second_operand.is_a? Integer
        if operation == '+'
          result = first_operand + second_operand
          return "#{first_operand} + #{second_operand} = #{result}"
        elsif operation == '/'
          begin
            if second_operand == 0
              raise ZeroDivisionError.new('Division by zero is not allowed.')
            else
              result = first_operand / second_operand
              return "#{first_operand} / #{second_operand} = #{result}"
            end
          rescue ZeroDivisionError => e
            return e.message
          end
        elsif operation == '*'
          result = first_operand * second_operand
          return "#{first_operand} * #{second_operand} = #{result}"
        end
      else
        raise ArgumentError.new()
      end
    else
      raise UnsupportedOperation.new()
    end
  end
end
