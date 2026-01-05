class Attendee
  def initialize(height)
    @height = height
  end

  def issue_pass!(pass_id)
    @pass_id = pass_id
  end

  def revoke_pass!
    @pass_id = nil
  end

  # Do not edit above methods, add your own methods below.

  def has_pass?
    return @pass_id != nil
  end

  def fits_ride?(ride_minimum_height)
    return @height >= ride_minimum_height
  end

  def allowed_to_ride?(ride_minimum_height)
    result1 = self.has_pass?
    debug "has_pas: #{result1}"
    result2 = self.fits_ride?(ride_minimum_height)
    debug "fits_ride: #{result2}"
    return result1 && result2
  end
end
