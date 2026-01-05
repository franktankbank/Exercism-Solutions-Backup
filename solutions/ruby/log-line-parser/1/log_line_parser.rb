class LogLineParser
  def initialize(line)
    @line = line
  end

  def message
    index = @line.index(':') + 1
    len = @line.size()
    return @line[index, len].strip()
  end

  def log_level
    start_index = @line.index('[') + 1
    end_index = @line.index(']') - 1

    return @line[start_index, end_index].downcase()
  end

  def reformat
    return "#{message} (#{log_level})"
  end
end
