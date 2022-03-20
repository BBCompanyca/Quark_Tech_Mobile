-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-03-2022 a las 20:07:39
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
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
  `cedula_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unformat_cedula_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `direction_client` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `direction_tienda` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de clientes';

--
-- Volcado de datos para la tabla `client`
--

INSERT INTO `client` (`id_client`, `name_client`, `telephone_client`, `unformat_telephone_client`, `cedula_client`, `unformat_cedula_client`, `direction_client`, `direction_tienda`, `registered_by`, `last_modification`) VALUES
(1, 'Maria Ramos', '0412 - 589.66.66', '04125896666', '27.913.620', '27913620', 'Valles del tuy', 'City Market', 'Joe_CM', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id_equipo` int(11) NOT NULL,
  `cedula_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unformat_cedula_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `marca` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `modelo` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `color` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `serial` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_venta` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `numero_orden` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_ingreso` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `recibido_con` longtext COLLATE utf8_unicode_ci NOT NULL,
  `falla` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_envio_tecnico` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tecnico` varchar(50) CHARACTER SET utf16 COLLATE utf16_unicode_ci NOT NULL,
  `solucion_tecnica` longtext COLLATE utf8_unicode_ci NOT NULL,
  `fecha_retorno` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_entrega` varchar(50) CHARACTER SET utf16 COLLATE utf16_unicode_ci NOT NULL,
  `registered_by` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de los equipos';

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
(1, 'Neifer Reverón', 'NeiferJesus14', 'Dilanjr15,.', '0414 - 214.46.84', '04142144684', 'Almacen', 'Moderador', 'System', '', 'Activo'),
(2, 'José Oleaga', 'Joe_CM', 'Joe_CM', '0414 - 589.65.55', '04145896555', 'City Market', 'Administrador', 'NeiferJesus14', '', 'Activo'),
(3, 'Adriana Medina', 'Adri_ZOO', 'Adri_ZOO', '5465 - 654.64.64', '54656546464', 'Caricuao', 'Administrador', 'NeiferJesus14', '', 'Activo');

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
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `client`
--
ALTER TABLE `client`
  MODIFY `id_client` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id_equipo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
