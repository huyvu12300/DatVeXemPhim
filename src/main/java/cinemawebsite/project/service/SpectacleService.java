package cinemawebsite.project.service;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import pl.cinemapj.ADVH.model.Spectacle;
import pl.cinemapj.ADVH.model.Repertoire;

public interface SpectacleService {

    String getSpectacles(final Model model);

    String addSpectacle(final Spectacle spectacle, final BindingResult result, final Model model);

    String showUpdateFormSpectacle(final long id, final Model model);

    String updateSpectacle(final long id, final Spectacle spectacle);

    String deleteSpectacle(final long id, final Model model);

    String showSpectacleRepertoireForm(final String spectacleName, final Model model);

    String addSpectacleRepertoire(final Repertoire repertoire, final Long spectacleId, final BindingResult result);

    String showUpdateSpectacleRepertoireForm(final String spectacleName, final Long repertoireId, final Model model);

    String updateSpectacleRepertoire(final Repertoire repertoire, final Long repertoireId, final BindingResult result);

    String deleteSpectacleRepertoire(final Long repertoireId, final Model model);
}