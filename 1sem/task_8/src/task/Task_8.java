package task;

public class Task_8 {
    public Class<?> subtask_1_DynamicPolymorphismProgramming() {
        try {
            return Class.forName("task.BattleUnit");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public Class<?> subtask_2_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task абстрактный класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: BattleUnitBase
         *   Смысл: Базовая реализация бойца
         *   Реализует: BattleUnit
         *   Конструктор:
         *       - принимающий в качестве параметров имя, макс. здоровье, базо-
         *         вую силу, макс. броню.
         *   Абстрактные методы:
         *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
         *       void attack(BattleUnit other)
         *   Дополнительно:
         *       - все остальные методы должны быть реализованы
         *       - минимальный уровень здоровья - 0
         *       - минимальный уровень брони - 0
         *       - здоровье и броня ни в какой момент не могут быть больше
         *         максимального уровня
         * ---------------------------------------------------------------------
         */

        try {
            return Class.forName("task.BattleUnitBase");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    public Class<?> subtask_3_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: Infantryman
         *   Смысл: Обыкновенный пехотинец
         *   Наследует: BattleUnitBase
         *   Конструктор:
         *       - принимающий в качестве параметров имя, макс. здоровье, базо-
         *         вую силу, макс. броню. Перенаправляет параметры в базовый
         *         конструктор
         *   Методы:
         *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
         *              - ничего не делает
         *       void attack(BattleUnit other)         - если противник в броне,
         *              наносит повреждения по здоровью, равные половине силы,
         *              и повреждения по броне равные четверти силы, иначе
         *              наносит повреждения здоровью, равные силе.
         *   Дополнительно:
         *       - минимальные повреждения любого типа - 1
         * ---------------------------------------------------------------------
         */
        try {
            return Class.forName("task.Infantryman");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    public Class<?> subtask_4_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: ArmorDestroyer
         *   Смысл: Боец, специализирующийся на расколе брони противника
         *   Наследует: BattleUnitBase
         *   Конструктор:
         *       - принимающий в качестве параметров имя, макс. здоровье, базо-
         *         вую силу, макс. броню. Перенаправляет параметры в базовый
         *         конструктор
         *   Методы:
         *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
         *          - выбирает живого противника с максимальной броней.
         *          Если противник в броне, наносит урон броне, равный удвоенной силе.
         *          Иначе наносит урон здоровью, равный четверти силы.
         *       void attack(BattleUnit other)         - если противник в броне,
         *              наносит повреждения по здоровью, равные четверти силы,
         *              и повреждения по броне равные силе, иначе
         *              наносит повреждения здоровью, равные половине силы.
         *   Дополнительно:
         *       - минимальные повреждения любого типа - 1
         * ---------------------------------------------------------------------
         */

        try {
            return Class.forName("task.ArmorDestroyer");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    public Class<?> subtask_5_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: Alchemist
         *   Смысл: Алхимик, исцеляющий союзников и дебафающий врагов
         *   Наследует: BattleUnitBase
         *   Конструктор:
         *       - принимающий в качестве параметров имя, макс. здоровье, базо-
         *         вую силу, макс. броню. Перенаправляет параметры в базовый
         *         конструктор
         *   Методы:
         *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
         *            - восстанавливает 10
         *              единиц здоровья живому сокоманднику с минимальным здоровьем
         *              увеличивает силу сокомандника с максимальным здоровьем на 1
         *       void attack(BattleUnit other)         - уменьшает показатель
         *              силы на 2 и максимального здоровья на 4 объекта other.
         * ---------------------------------------------------------------------
         */

        try {
            return Class.forName("task.Alchemist");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
