import math


class Clock:

    def __init__(self, hours, minutes):
        self.hours = hours + math.floor(minutes / 60)
        self.minutes = minutes
        self._sanitize()

    def _sanitize(self):
        self.hours %= 24
        self.minutes %= 60
        return self

    def add(self, minutes):
        self.hours += math.floor((self.minutes + minutes) / 60)
        self.minutes = (self.minutes + minutes) % 60
        return self._sanitize()

    def __str__(self):
        return '{hours}:{minutes}'.format(
            hours=('%02d' % self.hours),
            minutes=('%02d' % self.minutes))

    def __eq__(self, other):
        return self.hours == other.hours and self.minutes == other.minutes
