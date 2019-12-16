package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.engagement.契約;
import jp.co.biglobe.workshopmobile.domain.option.オプション;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;

class Request {
    public PlanForm getPlan() {
        return plan;
    }

    public boolean isEntame_free() {
        return entame_free;
    }

    public void setPlan(PlanForm plan) {
        this.plan = plan;
    }

    public void setEntame_free(boolean entame_free) {
        this.entame_free = entame_free;
    }

    // プラン
    private PlanForm plan;

    // 動画・音楽楽しみ放題　エンタメフリー・オプション
    private boolean entame_free;

    enum PlanForm {
        g1(Plan._1ギガ), // 1ギガ(スタート)
        g3(Plan._3ギガ), // 3ギガ
        g30(Plan._30ギガ); // 30ギガ

        private final Plan plan;

        PlanForm(Plan plan) {
            this.plan = plan;
        }

        Plan toPlan() {
            return this.plan;
        }
    }

    public 契約 to契約() {
        if (entame_free) {
            return new 契約(plan.toPlan(), オプション.エンタメフリーオプション);
        } else {
            return new 契約(plan.toPlan());
        }
    }
}
