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
    if len(dices) > 5:
        raise ValueError()

    return score_fives(dices)


def _score_n(dices: tuple[int, ...], n: int) -> int:
    return sum([d for d in dices if d == n])


def score_twos(dices: tuple[int, ...]) -> int:
    """
    Calculate the score of the dice roll within the TWOS category
    """
    return _score_n(dices, 2)


def score_fives(dices: tuple[int, ...]) -> int:
    """
    Calculate the score of the dice roll within the FIVES category
    """
    return _score_n(dices, 5)


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
