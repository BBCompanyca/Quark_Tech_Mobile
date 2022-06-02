-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2022 a las 04:10:22
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `quark_tech_mobile`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `client`
--

CREATE TABLE `client` (
  `id_client` int(11) NOT NULL,
  `name_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telephone_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unformat_telephone_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `identity_card_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unformat_identity_card_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `direction_client` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `direction_tienda` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(11) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de clientes';

--
-- Volcado de datos para la tabla `client`
--

INSERT INTO `client` (`id_client`, `name_client`, `telephone_client`, `unformat_telephone_client`, `identity_card_client`, `unformat_identity_card_client`, `direction_client`, `direction_tienda`, `registered_by`, `last_modification`) VALUES
(1, 'Neifer Reveron', '0414 - 589.65.23', '04145896523', 'V-27.913.620', 'V27913620', 'Charallave', 'City Market', '1', '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id_equipo` int(11) NOT NULL,
  `code` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `brand` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `model` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `color` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `capacity` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `day_warranty` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de los equipos';

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`id_equipo`, `code`, `brand`, `model`, `color`, `capacity`, `day_warranty`, `registered_by`, `last_modification`) VALUES
(1, '0102ALC2/32-N', 'Alcatel 1', '5033EP', 'Negro', '2/32GB', '15', 'NeiferJesus14', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `name_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telephone` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unformat_telephone_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `direction` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `type_account` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de usuarios.';

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id_user`, `name_user`, `username`, `password`, `telephone`, `unformat_telephone_user`, `direction`, `type_account`, `registered_by`, `last_modification`, `status`) VALUES
(1, 'Neifer Reverón', 'NeiferJesus14', '41DD3LQ4D6GVvOXW6vFX4A==', '0414 - 214.46.84', '04142144684', 'Almacen', 'Moderador', 'System', '12345', 'Activo'),
(2, 'Nery Ramos', 'Nery', 'U6tiCUDp7lU=', '0444 - 444.44.44', '04444444444', 'Almacen', 'Tecnico', 'NeiferJesus14', 'NeiferJesus14', 'Activo'),
(3, 'Richard Miller', 'Richard', 'rIxyf/mbZq0=', '0414 - 477.78.85', '04144777885', 'City Market', 'Administrador', 'NeiferJesus14', 'NeiferJesus14', 'Activo'),
(4, 'Adriana Medina', 'Adriana', 'a3uHkkgIX5I=', '0414 - 788.85.89', '04147888589', 'Caricuao', 'Administrador', 'NeiferJesus14', '', 'Activo'),
(5, 'Juan', 'Juan', 'A/TJ/+nsMT4=', '0144 - 444.44.44', '01444444444', 'City Market', 'Vendedor', 'Richard', 'NeiferJesus14', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `warranty`
--

CREATE TABLE `warranty` (
  `id_warranty` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_equipo` int(11) NOT NULL,
  `id_technical` int(11) NOT NULL,
  `id_registered_by` int(11) NOT NULL,
  `shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `serial` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `falla` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `date_register` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `received` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `day_warranty` int(10) NOT NULL,
  `date_sent_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `delivery_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_received_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `comments_technical` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `status_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_sent_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `delivery_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_received_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de las garantías...';

--
-- Volcado de datos para la tabla `warranty`
--

INSERT INTO `warranty` (`id_warranty`, `id_client`, `id_equipo`, `id_technical`, `id_registered_by`, `shop`, `serial`, `falla`, `date_register`, `received`, `day_warranty`, `date_sent_technical`, `delivery_technical`, `date_received_technical`, `comments_technical`, `status`, `status_technical`, `date_sent_shop`, `delivery_shop`, `date_received_shop`) VALUES
(1, 1, 1, 2, 1, 'Almacen', '123456', 'Software', '25/05/2022', 'asd', 14, '30/05/2022', 'Sr Roger', '30/05/2022', 'Cambio de pantalla', 'Entregado', 'No Reparado', '30/05/2022', 'Sr Roger', '30/05/2022'),
(2, 1, 1, 2, 1, 'Almacen', 'asdfg', 'Sofware', '30/05/2022', 'Cargador, audifonos y el equipo se encuentra en buen estado.', 0, '30/05/2022', 'Roger Fernandez', '30/05/2022', 'El que equipo se le hizo el root necesario y se logró recuperar el sistema.', 'Entregado', 'Reparado', '30/05/2022', 'Sr Roger', '30/05/2022'),
(3, 1, 1, 2, 1, 'Almacen', 'qwert', 'Corneta', '31/05/2022', 'Nada la vida es loca, vivela.', 0, '31/05/2022', 'Sr Roger.', '31/05/2022', 'asdad', 'Entregado', 'Reparado', '31/05/2022', 'Sr Roger', '31/05/2022');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id_client`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`id_equipo`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indices de la tabla `warranty`
--
ALTER TABLE `warranty`
  ADD PRIMARY KEY (`id_warranty`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `client`
--
ALTER TABLE `client`
  MODIFY `id_client` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id_equipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `warranty`
--
ALTER TABLE `warranty`
  MODIFY `id_warranty` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
