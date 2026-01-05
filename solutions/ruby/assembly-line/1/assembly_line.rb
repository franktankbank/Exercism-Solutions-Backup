class AssemblyLine
  def initialize(speed)
    @speed = speed
  end

  def production_rate_per_hour
    if @speed >= 1 && @speed <= 4
      return 221 * @speed
    elsif @speed >= 5 && @speed <= 8
      return (@speed * 221) * 0.9
    elsif @speed == 9
      return (@speed * 221) * 0.8
    elsif @speed == 10
      return (@speed * 221) * 0.77
    end
  end

  def working_items_per_minute
    result = self.production_rate_per_hour / 60
    return result.floor
  end
end
