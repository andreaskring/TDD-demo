from enum import Enum


class Category(Enum):
    ONES = "ones"
    TWOS = "twos"
    # ...
    FIVES = "fives"
    # ...
    CHANCE = "chance"  # Sum of dices
    YATZY = "yatzy"  # All dices identical
    FULL_HOUSE = "full_house"


def score(category: Category, dices: tuple[int, ...]) -> int:
    """
    Calculate the score of a dice roll with a given category
    """
    raise ValueError()


def score_twos(dices: tuple[int, ...]) -> int:
    """
    Calculate the score of the dice roll within the TWOS category
    """
    return sum([d for d in dices if d == 2])


def score_fives(dices: tuple[int, ...]) -> int:
    """
    Calculate the score of the dice roll within the FIVES category
    """
    pass


def score_chance(dices: tuple[int, ...]) -> int:
    """
    Calculate the score of the dice roll within the CHANCE category
    """
    return sum(dices)


def score_yatzy(dices: tuple[int, ...]) -> int:
    """
    Calculate the score of the dice roll within the YATZY category
    """
    pass
