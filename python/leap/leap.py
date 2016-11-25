

def is_leap_year(year):
    # Reminder -> PEP 8: do not assign a lambda expression, use a def
    def is_divisible_by(denominator): return year % denominator == 0
    return is_divisible_by(4) and (not is_divisible_by(100) or is_divisible_by(400))
